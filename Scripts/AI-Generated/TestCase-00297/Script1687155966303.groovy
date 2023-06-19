import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-we-define-array-in-katalon-to-save-values-in-for-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-we-define-array-in-katalon-to-save-values-in-for-loop/10715/4')

'step 2: Add visual checkpoint at Page_t_how-can-we-define-array-in-katalon-to-save-values-in-for-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00297_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
