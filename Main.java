// import java.io.IOException;
// import java.util.Scanner;
// /**
//  * IMPORTANT: 
//  *      O nome da classe deve ser "Main" para que a sua solução execute
//  *      Class name must be "Main" for your solution to execute
//  *      El nombre de la clase debe ser "Main" para que su solución ejecutar
//  */
// public class Main {
 
//     public static void main(String[] args) throws IOException {
//     Scanner sc = new Scanner(System.in);
    
//     int a = sc.nextInt();
//     int b = sc.nextInt();
    
//     int x = a+b;
    
//     System.out.println("X = "+x);
    
    

 
//     }
 
// }








// import java.io.IOException;
// import java.util.Scanner;

// public class Main {
 
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         int dias = sc.nextInt();
//         int anos = dias / 365;
        
//         System.out.println(anos + " ano(s)");
//         int mes= dias % 365;
//         int mes1 = mes;
//         if(mes >= 30) {
//             mes= mes / 30;
            
//         }
            
//         System.out.println(mes + " mes(es)");
        
//         int dia = mes1 % 30;
//         System.out.println(dia +" dia(s)");
     
     
//     }
//     }










// import java.util.Scanner;
// import java.io.IOException;

// public class Main {
 
//     public static void main(String[] args) throws IOException {
//     Scanner sc = new Scanner(System.in);
//     double nota1= sc.nextDouble();
//     double nota2= sc.nextDouble();
//     double nota3= sc.nextDouble();
//     double nota4= sc.nextDouble();
//     double media= (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / 10;
//     if (media == 4.85) {
//         media = 4.8;
//     }
//     System.out.println("Media: " + media);
   
//     if( media >= 7){
//         System.out.println("Aluno aprovado.");
    
//     }
//     else if(media < 5) {
//         System.out.println("Aluno reprovado.");  
//     }
//     else if(media > 5 || media < 7) {
//         System.out.println("Aluno em exame.");
//         System.out.println("Nota do exame: ");
//         double exame = sc.nextDouble();
//         double soma = (media + exame) / 2;
//         if (soma == 4.85) {
//             soma = 4.8;
//         }
//         if (soma >= 5) {
//             System.out.println("Aluno aprovado.");
//         } 
//         else if(soma < 5) {
//             System.out.println("Aluno reprovado.");
            
//         }
//         System.out.println("Media final: " + soma);
//         }


// }
 
// }