import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-click-on-a-dropdown-that-uses-angular-class-ng-content'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-click-on-a-dropdown-that-uses-angular-class-ng-content/29173')

'step 2: Add visual checkpoint at Page_t_how-to-click-on-a-dropdown-that-uses-angular-class-ng-content'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00860_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
