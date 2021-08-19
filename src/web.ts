import { WebPlugin } from '@capacitor/core';

import type { MyToastPlugin } from './definitions';

export class MyToastWeb extends WebPlugin implements MyToastPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async showToast(): Promise<void>{
    console.log('msg')
  }
 
}
