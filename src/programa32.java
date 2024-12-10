import java.util.Scanner;

public class programa32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0;
        double altura = 0.0;
        double volume = 0.0;
        double lado = 0.0;
        double comprimento = 0.0;
        double largura = 0.0;
        int opcao = 0;

        do{
            System.out.println(" ---------------------------------------------------");
            System.out.println(" Programa: Calcular volume de figura geométricas    ");
            System.out.println(" ---------------------------------------------------");
            System.out.println("    1 - Volume do Cilindro");
            System.out.println("    2 - Volume do Cone");
            System.out.println("    3 - Volume do Prisma");
            System.out.println("    4 - Volume do Esfera");
            System.out.println("    5 - Volume do Cubo");
            System.out.println("    6 - Volume do Pirâmide");
            System.out.println("    7 - Volume do Pararelepípedo");
            System.out.println("    0 - Sair");
            System.out.println("\n\n");
            System.out.println(" Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularVolume(raio, altura);

                    System.out.printf(" O Volume do Cilindro é: %.2f \n\n\n",volume);

                    break;
                case 2:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularVolume(raio, altura);

                    System.out.printf(" O Volume do Cone é: %.2f \n\n\n",volume);
                    break;
                case 3:
                    System.out.println(" Digite o valor do raio: ");
                    lado = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Prisma.calcularVolume(lado, altura);

                    System.out.printf(" O Volume do Prisma é: %.2f \n\n\n",volume);
                    break;
                case 4:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();

                    volume = Esfera.calcularVolume(raio);

                    System.out.printf(" O Volume da Esfera é: %.2f \n\n\n",volume);
                    break;
                case 5:
                    System.out.println(" Digite o valor do raio: ");
                    lado = sc.nextDouble();

                    volume = Cubo.calcularVolume(lado);

                    System.out.printf(" O Volume do Cubo é: %.2f \n\n\n",volume);
                    break;
                case 6:
                    System.out.println(" Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    altura = sc.nextDouble();

                    volume = Pirâmide.calcularVolume(lado,altura);

                    System.out.printf(" O Volume da Pirâmide é: %.2f \n\n\n",volume);
                    break;
                case 7:
                    System.out.println(" Digite o valor do raio: ");
                    comprimento = sc.nextDouble();
                    altura = sc.nextDouble();
                    largura = sc.nextDouble();

                    volume = Paralelepípedo.calcularVolume(comprimento, largura, altura);

                    System.out.printf(" O Volume do Paralelepípedo é: %.2f \n\n\n",volume);
                    break;
                case 0:
                    System.out.println(" Sair");
                    break;
                default:
                    System.out.println(" Opção Inválida! ");
                    break;
            }

        }while (opcao != 0);

        sc.close();
    }
}