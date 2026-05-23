/**
 * Aqui é onde inicia a primeira tela do sistema
 */

package clinica.view;

import javax.swing.*;// chama a ferramenta JFrame para que possa ser usada

public class JanelaPrincipal extends JFrame {// aqui avisa pro java que a Janela principal sera um JFrame (exibivel)
    public JanelaPrincipal() {// construtor (Base de toda a janela inicial)
        setTitle("Clínica Veterinária"); // define o título da janela
        setSize(800, 600);// define o tamanho (largura, altura)
        setDefaultCloseOperation(EXIT_ON_CLOSE); // encerra o programa ao fechar
        criarMenu(); // usa o menu que criamos com o construtor
        criarPainelCadastro();// adiciona o painel de cadastro
        setVisible(true); // torna a janela visível

    }

    private void criarMenu() {// Metodo de criar o menu, usado pois o menu será reutilizado na tela da consulta
        // 1. cria a barra
        JMenuBar barraMenu = new JMenuBar();

        // 2. cria os menus
        JMenu cadastro = new JMenu("Cadastro");
        JMenu consulta = new JMenu("Consulta");

        // 3. adiciona os menus na BarraMenu
        barraMenu.add(cadastro);
        barraMenu.add(consulta);

        // 4. Mostrar a barra na janela
        setJMenuBar(barraMenu);
    }

    private void criarPainelCadastro() {
        // 1. cria o painel principal (containerzão que vai ter o container da esquerda e o da direita)
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.X_AXIS));//X_AXIS é o eixo horizontal - essa linha diz (organize tudo lado a lado da esquerda pra direita)

        //2. Cria JPanel esquerdo
        JPanel painelEsquerdo = criarPainelEsquerdo();

        //3. Cria JPanel direito
        JPanel painelDireito = new JPanel();

        //4. adicionar o painel esquerdo e direito no painel principal
        painelPrincipal.add(painelEsquerdo);
        painelPrincipal.add(painelDireito);

        add(painelPrincipal);

    }

    private JPanel criarPainelEsquerdo(){
        String[] especies = {"cachorro", "gato", "ave", "coelho", "reptil", "outro"};

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));//aqui colocamos na vertical(Y_AXIS) pois iremos adicionar os campos uma abaixo do outro
        
        JLabel tituloInformacaoAnimal = new JLabel("Dados do animal");
        painel.add(tituloInformacaoAnimal);
        
        JLabel nomeAnimalLabel = new JLabel("Nome");
        painel.add(nomeAnimalLabel);

        JTextField nomeAnimal = new JTextField();
        painel.add(nomeAnimal);

        JLabel especie = new JLabel("especie");
        painel.add(especie);

        JComboBox<String> comboEspecie = new JComboBox<>(especies);
        painel.add(comboEspecie);

        JLabel raca = new JLabel("raça");
        painel.add(raca);

        JTextField racaAnimal = new JTextField();
        painel.add(racaAnimal);

        JLabel idade = new JLabel("idade");
        painel.add(idade);
        JTextField idadeAnimal = new JTextField();
        painel.add(idadeAnimal);

        JLabel sexo = new JLabel("Sexo");
        painel.add(sexo);
        //1. criação dos botões masculino e feminino
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");

        //2. junção dos dois em um ButtonGroup para somente um ser selecionado
        ButtonGroup grupoSexo = new ButtonGroup();

        grupoSexo.add(masculino);
        grupoSexo.add(feminino);

        painel.add(masculino);
        painel.add(feminino);

        //parte de informações do tutor
        JLabel tituloInformacaoTutor = new JLabel("Tutor Responsável");
        painel.add(tituloInformacaoTutor);

        JLabel nomeTutorLabel = new JLabel("Nome");
        painel.add(nomeTutorLabel);

        JTextField nomeTutor = new JTextField();
        painel.add(nomeTutor);

        JLabel telefone = new JLabel("Telefone");
        painel.add(telefone);

        JTextField telefoneTutor = new JTextField();
        painel.add(telefoneTutor);

        JLabel cpf = new JLabel("CPF");
        painel.add(cpf);

        JTextField cpfTutor = new JTextField();
        painel.add(cpfTutor);

        return painel;
    }
}

