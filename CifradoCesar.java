/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author cris
 */
public class CifradoCesar {

    public CifradoCesar() {
    }
    
     public String  cifrador(int clave,String  texto){
    String cifrado="";
    String  sub;
    String letrina;
    String letrina2;
    char letra;
    char[] abc =generadorAbecedario();

    for (int i=0;i<texto.length();i++){
        letrina=texto.substring(i,i+1);
letrina2=letrina.toLowerCase();
        letra=letrina2.charAt(0);

        sub=texto.substring(i,i+1);
        if (sub.contains(" ")){
            cifrado+=" ";
        }

        for (int k=0;k<26;k++){
            if (letra==abc[k]){

                if ((k+clave)<26){
                    cifrado+=abc[k+clave];
                }else {
                    int posi;
                    posi=(k+clave)-26;
                    cifrado+=abc[posi];

                }
                break;
            }

        }

    }
        System.out.println(cifrado);
    return  cifrado;
    }

     
     
     public String decifrador(int clave,String texto){
        String cifrado="";
        String  sub;
        char letra;
        char[] abc =generadorAbecedario();
        for (int i=0;i<texto.length();i++){
            letra=texto.charAt(i);
            sub=texto.substring(i,i+1);
            if (sub.contains(" ")){
                cifrado+=" ";
            }
            for (int k=0;k<26;k++){
                if (letra==abc[k]){

                    if ((k-clave)>-1){

                        cifrado+=abc[k-clave];

                    }else {
                        int posi;
                        posi=(k-clave)+26;
                        cifrado+=abc[posi];

                    }
                    break;
                }

            }

        }
        System.out.println(cifrado);
        return cifrado;
    }


    private char[] generadorAbecedario(){
        char abc[]=new char[26];
        char letra='a';
        int posicion;
        for (int i=0;i<26;i++){

            posicion=(int)letra;
            abc[i]=letra;
            posicion++;
            letra=(char) posicion;

        }
return abc;
    }
    
}