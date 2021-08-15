import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiscoverUsComponent } from './discover-us.component';

describe('DiscoverUsComponent', () => {
  let component: DiscoverUsComponent;
  let fixture: ComponentFixture<DiscoverUsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiscoverUsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiscoverUsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
