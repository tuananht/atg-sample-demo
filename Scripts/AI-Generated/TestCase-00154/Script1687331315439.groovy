import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-set-and-save-a-variable-using-the-script'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-set-and-save-a-variable-using-the-script/59351')

'step 2: Add visual checkpoint at Page_t_how-to-set-and-save-a-variable-using-the-script'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00154_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
