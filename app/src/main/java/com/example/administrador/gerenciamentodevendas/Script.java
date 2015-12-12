package com.example.administrador.gerenciamentodevendas;

/**
 * Created by Administrador on 07/12/2015.
 */
public class Script {
    String chamascript(){
        StringBuilder script=new StringBuilder();
        script.append("CREATE TABLE IF IS NOT NULL MERCADORIA( ");
        script.append("id   PRIMARYKAY  AUTOINCREMENT, ");
        script.append("NOME     VARCHAR(50), ");
        script.append("DESCRICAO    VARCHAR(50), ");
        script.append("VALOR_CUSTO      DOUBLE(00,00), ");
        script.append("VALOR_VENDA      DOUBLE(00,00), ");
        script.append(");");
    return script.toString();
    }
}
