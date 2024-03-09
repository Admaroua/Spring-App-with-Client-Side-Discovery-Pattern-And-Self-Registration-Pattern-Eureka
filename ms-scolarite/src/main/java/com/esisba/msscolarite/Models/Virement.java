package com.esisba.msscolarite.Models;

import lombok.Data;

import java.util.Date;

@Data
public class Virement {
    private Long idVirement;
    private Date dateVirement;
    private  Long nCompteCCP;
}
