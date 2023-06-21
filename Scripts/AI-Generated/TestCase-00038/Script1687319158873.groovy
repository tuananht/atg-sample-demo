import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_objects-not-being-found'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/objects-not-being-found/31436')

'step 2: Add visual checkpoint at Page_t_objects-not-being-found'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00038_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()