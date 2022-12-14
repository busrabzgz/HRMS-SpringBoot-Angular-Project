import {Receipt} from "./receipt.model";

export class Expense{
  createReceiptRequestDto?: Receipt[];
  description?:string;
  userId?:number;
}
