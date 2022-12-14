import {Component, EventEmitter, Input, OnInit, Output} from "@angular/core";
import {DialogModule} from 'primeng/dialog';
import {Leave} from "../../../models/leave.model";
import {Expense} from "../../../models/expense.model";
import {Receipt} from "../../../models/receipt.model";
import {ExpenseService} from "../../../services/expence.service";

@Component({
  selector:"expense",
  templateUrl:"expense.component.html",
  styleUrls:["expense.component.css"]
})
export class ExpenseComponent implements OnInit{

  @Input() createRequest: string;
  @Output() createdRequestDone = new EventEmitter<string>();

  displayBasic = false;
  value2: any;
  displayMaximizable: boolean=false;
  receipt: any;
  display: boolean = false;
  amount: any;
  categoryType = [

    {name: 'Is Giderleri', json: "WORKING_EXPENSES"},
    {name: 'Fatura ve Giderler', json: "BILL_EXPENSES"},
    {name: 'Egitim ve Kurslar', json: "EDUCATION_AND_COURSES"},
    {name: 'Yiyecek ve Icecek', json: "FOOD_AND_DRINK"},
    {name: 'Yolculuk ve Ulasim', json: "MARRIAGE_lEAVE"},
    {name: 'Diğer', json: "OTHER"},
  ]
  selectedCategoryType: any;
  dateOfReceipt: any;
  salesTaxRate: any;
  receipts: Receipt[] = [];
  description: any;

  constructor(private expenseService: ExpenseService) {
}

  ngOnInit(): void{
  }

  createExpense(){
    const expense: Expense = {
      createReceiptRequestDto:this.receipts,
      description:this.description,
      userId: 1
    };
    this.expenseService.createExpense(expense).subscribe(res => {
      console.log(res.body);
    });
    this.createdRequestDone.emit('');
  }

  ngOnChanges(changes: any) {
    console.log(changes);
    if (changes.createRequest.currentValue == 'send') {
      console.log('changes');
      this.createExpense();
    }
  }




  showBasicDialog() {
    this.displayBasic=!this.displayBasic;
  }

  showMaximizableDialog() {
    this.displayMaximizable = true;
  }

  addReceipt() {
    this.receipts.push(
      {
        billImage:this.receipt,
        category: this.selectedCategoryType,
        amount:this.amount ,
        dateOfReceipt: this.dateOfReceipt,
        salesTaxRate: this.salesTaxRate,
        description:this.description
      }
    );
    console.log(this.receipts)
  }
}
