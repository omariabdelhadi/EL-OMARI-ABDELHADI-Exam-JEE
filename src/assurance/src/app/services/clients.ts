import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Client} from '../modele/Client';

@Injectable({
  providedIn: 'root',
})
export class Clients {
  constructor(private http:HttpClient) {
  }
  public getAllClient():Observable<Array<Client>>{
    return this.http.get<Array<Client>>('http://localhost:8080/Clients');
  }
}
