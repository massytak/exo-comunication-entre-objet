package com.f2i.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.f2i.entity.Dossier;
import com.f2i.service.IDirecteur;
import com.f2i.service.ISecretaria;

@Component
public class Secretaria implements ISecretaria {
	@Autowired
	private IDirecteur directeur;
	@Override
	public void enregistrer(Dossier dossier) {
		System.out.println("***********Le dossier est enregistrer*************");
		dossier.setStatus("Enregistrer");
		System.out.println(dossier);
		directeur.signer(dossier);

	}

}
