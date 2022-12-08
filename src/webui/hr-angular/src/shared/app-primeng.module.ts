import { SharedModule } from 'primeng/api';
import { TableModule } from 'primeng/table';
import { DialogModule } from 'primeng/dialog';
import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DropdownModule } from 'primeng/dropdown';
import { MenubarModule } from 'primeng/menubar';
import { ButtonModule } from 'primeng/button';
import { ListboxModule } from 'primeng/listbox';
import { RadioButtonModule } from 'primeng/radiobutton';
import { PanelModule } from 'primeng/panel';
import { CalendarModule } from 'primeng/calendar';
import { AccordionModule } from 'primeng/accordion';
import { TabViewModule } from 'primeng/tabview';
import { FocusTrapModule } from 'primeng/focustrap';
import { CheckboxModule } from 'primeng/checkbox';
import { TreeTableModule } from 'primeng/treetable';
import { TreeModule } from 'primeng/tree';
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import {InputTextareaModule} from 'primeng/inputtextarea';
import {InputMaskModule} from 'primeng/inputmask';
import {TooltipModule} from 'primeng/tooltip';
import {FileUploadModule} from 'primeng/fileupload';
import {ToastModule} from 'primeng/toast';
import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {PanelMenuModule} from "primeng/panelmenu";
//
export const APP_PRIMENG_MODULE = [
  CommonModule,
	SharedModule,
	TableModule,
	DialogModule,
	ConfirmDialogModule,
	DropdownModule,
	MenubarModule,
	ButtonModule,
	ListboxModule,
	RadioButtonModule,
	PanelModule,
	AccordionModule,
	CalendarModule,
	TabViewModule,
	FocusTrapModule,
	CheckboxModule,
	TreeTableModule,
	TreeModule,
	CardModule,
	InputTextModule,
	InputTextareaModule,
	InputMaskModule,
	TooltipModule,
	FileUploadModule,
	ToastModule,
  PanelMenuModule,
  SlideMenuModule,
  AutoCompleteModule,
];
//
@NgModule({
  declarations: [
  ],
  imports: [APP_PRIMENG_MODULE],
  exports: [APP_PRIMENG_MODULE,]
})
export class AppPrimengModule {}
//
import { ConfirmationService } from 'primeng/api';
import { MessageService } from 'primeng/api';
import {SlideMenuModule} from "primeng/slidemenu";
import {AutoCompleteModule} from "primeng/autocomplete";
//
export const APP_PRIMENG_PROVIDERS = [
  ConfirmationService,
  MessageService
];
