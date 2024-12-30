package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Analyse whether this all needs to become a 
// dictionary<Integer, ParticipantFrameDto>
public class ParticipantFramesDto {
    @JsonProperty("1")
    private ParticipantFrameDto participant1;

    @JsonProperty("2")
    private ParticipantFrameDto participant2;

    @JsonProperty("3")
    private ParticipantFrameDto participant3;

    @JsonProperty("4")
    private ParticipantFrameDto participant4;

    @JsonProperty("5")
    private ParticipantFrameDto participant5;

    @JsonProperty("6")
    private ParticipantFrameDto participant6;

    @JsonProperty("7")
    private ParticipantFrameDto participant7;

    @JsonProperty("8")
    private ParticipantFrameDto participant8;

    @JsonProperty("9")
    private ParticipantFrameDto participant9;

    public ParticipantFramesDto() {
    }

    public ParticipantFrameDto getParticipant1() {
        return this.participant1;
    }

    public void setParticipant1(ParticipantFrameDto participant1) {
        this.participant1 = participant1;
    }

    public ParticipantFrameDto getParticipant2() {
        return this.participant2;
    }

    public void setParticipant2(ParticipantFrameDto participant2) {
        this.participant2 = participant2;
    }

    public ParticipantFrameDto getParticipant3() {
        return this.participant3;
    }

    public void setParticipant3(ParticipantFrameDto participant3) {
        this.participant3 = participant3;
    }

    public ParticipantFrameDto getParticipant4() {
        return this.participant4;
    }

    public void setParticipant4(ParticipantFrameDto participant4) {
        this.participant4 = participant4;
    }

    public ParticipantFrameDto getParticipant5() {
        return this.participant5;
    }

    public void setParticipant5(ParticipantFrameDto participant5) {
        this.participant5 = participant5;
    }

    public ParticipantFrameDto getParticipant6() {
        return this.participant6;
    }

    public void setParticipant6(ParticipantFrameDto participant6) {
        this.participant6 = participant6;
    }

    public ParticipantFrameDto getParticipant7() {
        return this.participant7;
    }

    public void setParticipant7(ParticipantFrameDto participant7) {
        this.participant7 = participant7;
    }

    public ParticipantFrameDto getParticipant8() {
        return this.participant8;
    }

    public void setParticipant8(ParticipantFrameDto participant8) {
        this.participant8 = participant8;
    }

    public ParticipantFrameDto getParticipant9() {
        return this.participant9;
    }

    public void setParticipant9(ParticipantFrameDto participant9) {
        this.participant9 = participant9;
    }

    public ParticipantFramesDto(ParticipantFrameDto participant1, ParticipantFrameDto participant2,
            ParticipantFrameDto participant3, ParticipantFrameDto participant4, ParticipantFrameDto participant5,
            ParticipantFrameDto participant6, ParticipantFrameDto participant7, ParticipantFrameDto participant8,
            ParticipantFrameDto participant9) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.participant3 = participant3;
        this.participant4 = participant4;
        this.participant5 = participant5;
        this.participant6 = participant6;
        this.participant7 = participant7;
        this.participant8 = participant8;
        this.participant9 = participant9;
    }

}