import { registerPlugin } from '@capacitor/core';

import type { MyToastPlugin } from './definitions';

const MyToast = registerPlugin<MyToastPlugin>('MyToast', {
  web: () => import('./web').then(m => new m.MyToastWeb()),
});

export * from './definitions';
export { MyToast };
