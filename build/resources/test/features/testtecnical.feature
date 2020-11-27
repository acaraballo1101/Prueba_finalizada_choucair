 #language: es

   @stories

Característica: Realizar busqueda de cursos en la pagina de Choucair
  Yo como usuario
  Quiero buscar cursos
  para aprender a automatizar

  @scenario1

  Escenario: Busqueda de curso exitosa
    Dado que Andres quiere hacer un curso en la pagina Academia Choucair
    |strUser  | strPassword |
    |1143348819 | Choucair2020* |
    Cuando busca cursos Workshop de Automatización
    |strCurso               |
    |Workshop de Automatización |
    Entonces se debe visualizar en el titulo
    |strtitulo  |
    |Workshop de Automatización |