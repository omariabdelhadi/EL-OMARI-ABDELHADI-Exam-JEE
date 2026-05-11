import { Component, OnInit } from '@angular/core';
import { Paiement } from '../../modele/Paiement';
import { Paiements } from '../../services/Paiements';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-paiements',
  templateUrl: './paiements.component.html',
  imports: [NgForOf],
})
export class PaiementsComponent implements OnInit {
  paiements: Array<Paiement> = [];

  constructor(private paiementService: Paiements) {}

  ngOnInit(): void {
    this.paiementService.getAllPaiement().subscribe(data => {
      this.paiements = data;
    });
  }
}
