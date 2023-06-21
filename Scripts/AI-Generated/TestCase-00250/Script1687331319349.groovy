import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-is-not-able-to-perform-click-on-angular-mat-expansion-panel-and-mat-tabs-did-anyone-face-the-same-issue-and-solved-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-is-not-able-to-perform-click-on-angular-mat-expansion-panel-and-mat-tabs-did-anyone-face-the-same-issue-and-solved-it/18438/4')

'step 2: Add visual checkpoint at Page_t_katalon-is-not-able-to-perform-click-on-angular-mat-expansion-panel-and-mat-tabs-did-anyone-face-the-same-issue-and-solved-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00250_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
