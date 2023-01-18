import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSujetComponent } from './view-sujet.component';

describe('ViewSujetComponent', () => {
  let component: ViewSujetComponent;
  let fixture: ComponentFixture<ViewSujetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewSujetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewSujetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
