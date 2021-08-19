package com.minabeshara.example;

import android.widget.Toast;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "MyToast")
public class MyToastPlugin extends Plugin {

    private MyToast implementation = new MyToast();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void showToast(PluginCall call){
        implementation.showToast(this.getActivity().getApplicationContext());
        call.resolve();
    }

}
