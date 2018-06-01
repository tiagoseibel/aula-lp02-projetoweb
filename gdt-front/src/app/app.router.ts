import {Routes, RouterModule} from '@angular/router'
import { BlocoComponent } from './bloco/bloco.component';
import { HomeComponent } from './home/home.component';

const rotas: Routes = [
    {
        path: '',
        component: HomeComponent
    },
    {
        path: 'blocos',
        component: BlocoComponent
    }    
];

export const Roteador = RouterModule.forRoot(rotas); 