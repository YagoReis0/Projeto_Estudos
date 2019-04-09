/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Senac
 */
public class CarrosBEANS {
    
    private String categoria;
    private String fabricante;
    private String veiculo;
    private String motor;
    private String ArCond;
    private String cambio;
    private String gps;
    private String combustivel;
    private String bancos;
    private String opcionais1;
    private String opcionais2;
    private String opcionais3;
//----- Construtor -------------------------------------------------------------
    public CarrosBEANS() {
    }
//----- Getter's & Setter's ----------------------------------------------------
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//---------------------------------------------------
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
//---------------------------------------------------
    public String getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
//---------------------------------------------------
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
//---------------------------------------------------
    public String getArCond() {
        return ArCond;
    }
    public void setArCond(String ArCond) {
        this.ArCond = ArCond;
    }
//---------------------------------------------------
    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
//---------------------------------------------------
    public String getGps() {
        return gps;
    }
    public void setGps(String gps) {
        this.gps = gps;
    }
//---------------------------------------------------
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
//---------------------------------------------------
    public String getBancos() {
        return bancos;
    }
    public void setBancos(String bancos) {
        this.bancos = bancos;
    }
//---------------------------------------------------
    public String getOpcionais1() {
        return opcionais1;
    }
    public void setOpcionais1(String opcionais1) {
        this.opcionais1 = opcionais1;
    }
//---------------------------------------------------
    public String getOpcionais2() {
        return opcionais2;
    }
    public void setOpcionais2(String opcionais2) {
        this.opcionais2 = opcionais2;
    }
//---------------------------------------------------
    public String getOpcionais3() {
        return opcionais3;
    }
    public void setOpcionais3(String opcionais3) {
        this.opcionais3 = opcionais3;
    }
//----- toString ---------------------------------------------------------------
    @Override
    public String toString() {
        return "CarrosBEANS{" + "veiculo=" + veiculo + ", ArCond=" + ArCond + ", cambio=" + cambio + ", gps=" + gps + ", bancos=" + bancos + '}';
    }
}
