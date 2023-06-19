import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-make-a-variable-equal-to-a-boolean-value'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-make-a-variable-equal-to-a-boolean-value/13938')

'step 2: Add visual checkpoint at Page_t_how-to-make-a-variable-equal-to-a-boolean-value'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00225_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
