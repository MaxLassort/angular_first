import { Component } from '@angular/core';
import { BehaviorSubject, Observable, Subject, Subscription } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  public title: string;
  public open:boolean;
  private subj = new Subject();
  private behave = new BehaviorSubject(0);

  //suscription manuel
  public test: BehaviorSubject<any>;
  public sub: Subscription;
  private obs = new Observable((listXsubscribe) => {
    listXsubscribe.next(Math.random() * 200);
  });


  constructor(){
    this.title="crm";
    this.open=true;
    //observable
    // this.obs.subscribe((data) => console.log(data));
    // this.obs.subscribe((data) => console.log(data));
    ////////////////////////
    // subjects
    // this.subj.next('test1');
    // this.subj.subscribe((data) => console.log(data));
    // this.subj.next('test2');
    // this.subj.next('test 2');
    // this.subj.subscribe((data) => console.log(data));
    // this.subj.next(Math.random());
    // this.subj.subscribe((data) => console.log(data));
    ///////////////////
    // this.behave.subscribe((data) => console.log(data));
    // this.behave.next(1);
    // this.behave.subscribe((data) => console.log(data));
    // this.behave.next(2);
    // this.behave.next(Math.random());
    // this.behave.subscribe((data) => console.log(data));
    // this.behave.subscribe((data) => console.log(data));

    //subscription manuel
    this.test = new BehaviorSubject<any>(1);
    this.sub= this.test.subscribe();
  }

  public changeLogo(){
    this.open = !this.open;
  }


  ngOnDestroy(): void{
    this.sub.unsubscribe;
  }
}
