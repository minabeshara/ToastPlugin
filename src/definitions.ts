export interface MyToastPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
