import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import { map, catchError } from 'rxjs/operators';
import { Observable } from 'rxjs';

import { Bloco } from './bloco.model';

@Injectable()
export class BlocoService {

  url: string = "http://localhost/api/bloco";

  constructor(private http: Http) { }

  getAll() {
    return this.http.get(this.url).pipe(
      map((data) => data.json())
    );
  }

  save(bloco: Bloco) {
    return this.http.post(this.url, bloco).pipe(
      map((data) => { data.json() }),
      catchError(this.handleServerError)
    );
  }

  delete(id: number) {
    return this.http.delete(this.url + "/" + id).pipe(
      map((data) => data.json()),
      catchError((error) => error.json())
    );
  }

  handleServerError(error: any) {
    console.log(error.error || error || "Server error");
    return Observable.throw(error.error || error.json() || error || "Server error")
  }

}
