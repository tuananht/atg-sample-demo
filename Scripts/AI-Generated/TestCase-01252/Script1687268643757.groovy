import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-error-as-unable-to-sendkeys-to-testobject-because-unable-to-focus-on-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-error-as-unable-to-sendkeys-to-testobject-because-unable-to-focus-on-element/8840/4')

'step 2: Add visual checkpoint at Page_t_getting-error-as-unable-to-sendkeys-to-testobject-because-unable-to-focus-on-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01252_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
