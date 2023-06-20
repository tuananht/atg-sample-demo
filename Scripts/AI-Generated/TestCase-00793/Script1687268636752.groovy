import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_trying-to-save-value-of-a-given-element-into-variable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/trying-to-save-value-of-a-given-element-into-variable/20739')

'step 2: Add visual checkpoint at Page_t_trying-to-save-value-of-a-given-element-into-variable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00793_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
