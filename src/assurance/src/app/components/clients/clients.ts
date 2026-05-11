import { Component, OnInit } from '@angular/core';
import { Client } from '../../modele/Client';
import { Clients } from '../../services/clients';
import {NgFor,NgIf} from '@angular/common';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  imports: [NgFor,NgIf],
})
export class ClientsComponent implements OnInit {
  clients: Array<Client> = [];

  constructor(private clientService: Clients) {}

  ngOnInit(): void {
    this.clientService.getAllClient().subscribe(data => {
      this.clients = data;
    });
  }
}
