package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.userinterface.FavoriteLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private  String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login OnThePage(String strUser,String strPassword) {
            return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FavoriteLoginPage.BOTON_ACCEDER),
                Enter.theValue(strUser).into(FavoriteLoginPage.CAJA_CORREO),
                Enter.theValue(strPassword).into(FavoriteLoginPage.CAJA_PASSWORD),
                Click.on(FavoriteLoginPage.BOTON_SIGUIENTE_PWD)
                );
    }
}
