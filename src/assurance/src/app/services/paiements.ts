import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Paiements {
  constructor(private http:HttpClient) {
  }

  public getAllPaiement():Observable<Array<Paiements>>{
    return this.http.get<Array<Paiements>>('http://localhost:8080/paiements')
  }
}
