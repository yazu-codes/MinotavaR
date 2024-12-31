package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequireGradeCounts {
    @JsonProperty("S+")
    private Integer SPLUS;

    @JsonProperty("S")
    private Integer S;

    @JsonProperty("S-")
    private Integer SMINUS;

    @JsonProperty("A+")
    private Integer APLUS;

    @JsonProperty("A")
    private Integer A;

    @JsonProperty("A-")
    private Integer AMINUS;

    @JsonProperty("B+")
    private Integer BPLUS;

    @JsonProperty("B")
    private Integer B;

    @JsonProperty("B-")
    private Integer BMINUS;

    @JsonProperty("C+")
    private Integer CPLUS;

    @JsonProperty("C")
    private Integer C;

    @JsonProperty("C-")
    private Integer CMINUS;

    @JsonProperty("D+")
    private Integer DPLUS;

    @JsonProperty("D")
    private Integer D;

    @JsonProperty("D-")
    private Integer DMINUS;

    @JsonProperty("E+")
    private Integer EPLUS;

    @JsonProperty("E")
    private Integer E;

    @JsonProperty("E-")
    private Integer EMINUS;

    @JsonProperty("F")
    private Integer F;

    public RequireGradeCounts() {
    }

    public RequireGradeCounts(Integer SPLUS, Integer S, Integer SMINUS, Integer APLUS, Integer A, Integer AMINUS,
            Integer BPLUS, Integer B, Integer BMINUS, Integer CPLUS, Integer C, Integer CMINUS, Integer DPLUS,
            Integer D, Integer DMINUS, Integer EPLUS, Integer E, Integer EMINUS, Integer F) {
        this.SPLUS = SPLUS;
        this.S = S;
        this.SMINUS = SMINUS;
        this.APLUS = APLUS;
        this.A = A;
        this.AMINUS = AMINUS;
        this.BPLUS = BPLUS;
        this.B = B;
        this.BMINUS = BMINUS;
        this.CPLUS = CPLUS;
        this.C = C;
        this.CMINUS = CMINUS;
        this.DPLUS = DPLUS;
        this.D = D;
        this.DMINUS = DMINUS;
        this.EPLUS = EPLUS;
        this.E = E;
        this.EMINUS = EMINUS;
        this.F = F;
    }

    public Integer getSPLUS() {
        return this.SPLUS;
    }

    public void setSPLUS(Integer SPLUS) {
        this.SPLUS = SPLUS;
    }

    public Integer getS() {
        return this.S;
    }

    public void setS(Integer S) {
        this.S = S;
    }

    public Integer getSMINUS() {
        return this.SMINUS;
    }

    public void setSMINUS(Integer SMINUS) {
        this.SMINUS = SMINUS;
    }

    public Integer getAPLUS() {
        return this.APLUS;
    }

    public void setAPLUS(Integer APLUS) {
        this.APLUS = APLUS;
    }

    public Integer getA() {
        return this.A;
    }

    public void setA(Integer A) {
        this.A = A;
    }

    public Integer getAMINUS() {
        return this.AMINUS;
    }

    public void setAMINUS(Integer AMINUS) {
        this.AMINUS = AMINUS;
    }

    public Integer getBPLUS() {
        return this.BPLUS;
    }

    public void setBPLUS(Integer BPLUS) {
        this.BPLUS = BPLUS;
    }

    public Integer getB() {
        return this.B;
    }

    public void setB(Integer B) {
        this.B = B;
    }

    public Integer getBMINUS() {
        return this.BMINUS;
    }

    public void setBMINUS(Integer BMINUS) {
        this.BMINUS = BMINUS;
    }

    public Integer getCPLUS() {
        return this.CPLUS;
    }

    public void setCPLUS(Integer CPLUS) {
        this.CPLUS = CPLUS;
    }

    public Integer getC() {
        return this.C;
    }

    public void setC(Integer C) {
        this.C = C;
    }

    public Integer getCMINUS() {
        return this.CMINUS;
    }

    public void setCMINUS(Integer CMINUS) {
        this.CMINUS = CMINUS;
    }

    public Integer getDPLUS() {
        return this.DPLUS;
    }

    public void setDPLUS(Integer DPLUS) {
        this.DPLUS = DPLUS;
    }

    public Integer getD() {
        return this.D;
    }

    public void setD(Integer D) {
        this.D = D;
    }

    public Integer getDMINUS() {
        return this.DMINUS;
    }

    public void setDMINUS(Integer DMINUS) {
        this.DMINUS = DMINUS;
    }

    public Integer getEPLUS() {
        return this.EPLUS;
    }

    public void setEPLUS(Integer EPLUS) {
        this.EPLUS = EPLUS;
    }

    public Integer getE() {
        return this.E;
    }

    public void setE(Integer E) {
        this.E = E;
    }

    public Integer getEMINUS() {
        return this.EMINUS;
    }

    public void setEMINUS(Integer EMINUS) {
        this.EMINUS = EMINUS;
    }

    public Integer getF() {
        return this.F;
    }

    public void setF(Integer F) {
        this.F = F;
    }

}
