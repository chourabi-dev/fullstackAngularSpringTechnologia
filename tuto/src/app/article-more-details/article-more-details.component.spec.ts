import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArticleMoreDetailsComponent } from './article-more-details.component';

describe('ArticleMoreDetailsComponent', () => {
  let component: ArticleMoreDetailsComponent;
  let fixture: ComponentFixture<ArticleMoreDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArticleMoreDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticleMoreDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
