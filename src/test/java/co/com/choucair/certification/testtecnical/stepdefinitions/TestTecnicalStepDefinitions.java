package co.com.choucair.certification.testtecnical.stepdefinitions;

import co.com.choucair.certification.testtecnical.model.TestTecnicalData;
import co.com.choucair.certification.testtecnical.questions.Answer;
import co.com.choucair.certification.testtecnical.tasks.Login;
import co.com.choucair.certification.testtecnical.tasks.OpenUp;
import co.com.choucair.certification.testtecnical.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class TestTecnicalStepDefinitions {

    @Before
    public void setStage (){

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Andres quiere hacer un curso en la pagina Academia Choucair")
    public void queAndresQuiereHacerUnCursoEnLaPaginaAcademiaChoucair(List<TestTecnicalData> testTecnicalData) throws Exception{
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), (Login.
                OnThePage(testTecnicalData.get(0).getStrUser(),testTecnicalData.get(0).getStrPassword())));
    }

    @Cuando("busca cursos")
    public void buscaCursosRecursosDeAutomatizacionBancolombia(List<TestTecnicalData> testTecnicalData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(testTecnicalData.get(0).getStrCurso()));
    }

    @Entonces("se debe visualizar en el titulo")
    public void seDebeVisualizarEnElTituloRecursosDeAutomatizacionBancolombia(List<TestTecnicalData> testTecnicalData) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(testTecnicalData.get(0).getStrtitulo())));
    }
}
