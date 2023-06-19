import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-variable-in-objects-properties'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-variable-in-objects-properties/11335')

'step 2: Add visual checkpoint at Page_t_using-variable-in-objects-properties'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00160_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
