import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-variables-in-test-objects-xpath'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-variables-in-test-objects-xpath/33714')

'step 2: Add visual checkpoint at Page_t_using-variables-in-test-objects-xpath'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00390_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
