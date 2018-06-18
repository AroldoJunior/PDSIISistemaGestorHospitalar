
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    testesCadastroFuncionario.class,
    testesLoginMaster.class,
    testesPaciente.class,
    testesAlterarFuncionario.class,
    testesAlterarPaciente.class,
    testesPaciente.class
})

public class testesSuite {

}
