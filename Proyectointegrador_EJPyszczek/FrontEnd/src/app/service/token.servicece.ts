import { Injectable } from '@angular/core';

const TOKEN_KEY = 'AuthToken';
const USERNAME_KEY = 'AuthUsername';
const AUTHORITIES_KEY = 'Authorities';

@Injectable({
    providedIn: 'root'
})
export class TokenService {
    constructor() { }
}


