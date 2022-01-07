package com.f2i.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.f2i.entity.Dossier;
import com.f2i.service.IGuichet;
import com.f2i.service.ISecretaria;

@Component
public class Guichet implements IGuichet {
	@Autowired
	private ISecretaria secretaire;
	@Override
	public void valider(Dossier dossier) {
		System.out.println("*****************notre dossier************************");
		System.out.println(dossier.toString());
		System.out.println("***********traitement de dossier par le guichet*************");
		dossier.setStatus("valider");
		System.out.println(dossier);
		secretaire.enregistrer(dossier);
		
	}

}
