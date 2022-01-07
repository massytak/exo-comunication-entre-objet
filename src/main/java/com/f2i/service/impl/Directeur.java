package com.f2i.service.impl;

import org.springframework.stereotype.Component;

import com.f2i.entity.Dossier;
import com.f2i.service.IDirecteur;
@Component
public class Directeur implements IDirecteur {

	@Override
	public void signer(Dossier dossier) {
		System.out.println("***********traitement de dossier est signet*************");
		dossier.setStatus("signet");
		System.out.println(dossier);
		
		
	}

	

}
