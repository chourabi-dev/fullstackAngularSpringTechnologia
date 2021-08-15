import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewtypesComponent } from './newtypes.component';

describe('NewtypesComponent', () => {
  let component: NewtypesComponent;
  let fixture: ComponentFixture<NewtypesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewtypesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewtypesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
