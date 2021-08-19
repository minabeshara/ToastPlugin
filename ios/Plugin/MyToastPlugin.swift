import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(MyToastPlugin)
public class MyToastPlugin: CAPPlugin {
    private let implementation = MyToast()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }

    @objc func showToast(_ call: CAPPluginCall){
        MBProgressHUD *hud = [MBProgressHUD showHUDAddedTo:self.navigationController.view animated:YES];
// 
        hud.mode = MBProgressHUDModeText;
        hud.label.text = "ios";
        hud.margin = 10.f;
        hud.yOffset = 150.f;
        hud.removeFromSuperViewOnHide = YES;

        [hud hideAnimated:YES afterDelay:3];
        call.resolve();
    }
}
