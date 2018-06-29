import { Component, OnInit } from '@angular/core';
import { BlocoService } from './bloco.service';
import { Bloco } from './bloco.model';

@Component({
  selector: 'app-bloco',
  templateUrl: './bloco.component.html',
  providers: [BlocoService]
})
export class BlocoComponent implements OnInit {

  blocos: Bloco;
  bloco: Bloco = new Bloco();

  constructor(private service: BlocoService) { }

  ngOnInit() {
    this.findAll();
  }

  edit(bloco: Bloco) {
    this.bloco = bloco;
  }

  save() {
    this.service.save(this.bloco).subscribe(
      () => this.findAll()
    );

  }

  findAll() {
    this.service.getAll().subscribe(
      (data) => this.blocos = data
    );
  }

  delete(id: number) {
    if (confirm("Are you sure?")) {
      this.service.delete(id).subscribe(
        () => this.findAll()
      );
    }
  }

}
