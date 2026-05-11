export interface Paiement{
  id:number,
  date:Date,
  montant:number
  type: 'MENSUALITE' | 'PAIEMENT_ANNUEL' | 'PAIEMENT_EXCEPTIONNEL'
  contratId:number
}
