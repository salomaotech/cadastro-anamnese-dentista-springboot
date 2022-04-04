package br.com.salomaotech.cadastro.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long id_paciente;
    private String resposta1;
    private String resposta2;
    private String resposta3;
    private String resposta4;
    private String resposta5;
    private String resposta6;
    private String resposta7;
    private String resposta8;
    private String resposta9;
    private String resposta10;
    private String resposta11;
    private String resposta12;
    private String resposta13;
    private String resposta14;
    private String resposta15;
    private String resposta16;
    private String resposta17;
    private String resposta18;
    private String resposta19;

    public CadastroModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public String getResposta2() {
        return resposta2;
    }

    public void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }

    public String getResposta3() {
        return resposta3;
    }

    public void setResposta3(String resposta3) {
        this.resposta3 = resposta3;
    }

    public String getResposta4() {
        return resposta4;
    }

    public void setResposta4(String resposta4) {
        this.resposta4 = resposta4;
    }

    public String getResposta5() {
        return resposta5;
    }

    public void setResposta5(String resposta5) {
        this.resposta5 = resposta5;
    }

    public String getResposta6() {
        return resposta6;
    }

    public void setResposta6(String resposta6) {
        this.resposta6 = resposta6;
    }

    public String getResposta7() {
        return resposta7;
    }

    public void setResposta7(String resposta7) {
        this.resposta7 = resposta7;
    }

    public String getResposta8() {
        return resposta8;
    }

    public void setResposta8(String resposta8) {
        this.resposta8 = resposta8;
    }

    public String getResposta9() {
        return resposta9;
    }

    public void setResposta9(String resposta9) {
        this.resposta9 = resposta9;
    }

    public String getResposta10() {
        return resposta10;
    }

    public void setResposta10(String resposta10) {
        this.resposta10 = resposta10;
    }

    public String getResposta11() {
        return resposta11;
    }

    public void setResposta11(String resposta11) {
        this.resposta11 = resposta11;
    }

    public String getResposta12() {
        return resposta12;
    }

    public void setResposta12(String resposta12) {
        this.resposta12 = resposta12;
    }

    public String getResposta13() {
        return resposta13;
    }

    public void setResposta13(String resposta13) {
        this.resposta13 = resposta13;
    }

    public String getResposta14() {
        return resposta14;
    }

    public void setResposta14(String resposta14) {
        this.resposta14 = resposta14;
    }

    public String getResposta15() {
        return resposta15;
    }

    public void setResposta15(String resposta15) {
        this.resposta15 = resposta15;
    }

    public String getResposta16() {
        return resposta16;
    }

    public void setResposta16(String resposta16) {
        this.resposta16 = resposta16;
    }

    public String getResposta17() {
        return resposta17;
    }

    public void setResposta17(String resposta17) {
        this.resposta17 = resposta17;
    }

    public String getResposta18() {
        return resposta18;
    }

    public void setResposta18(String resposta18) {
        this.resposta18 = resposta18;
    }

    public String getResposta19() {
        return resposta19;
    }

    public void setResposta19(String resposta19) {
        this.resposta19 = resposta19;
    }

}
