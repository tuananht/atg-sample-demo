import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_two-objects-have-same-xpath'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/two-objects-have-same-xpath/8713')

'step 2: Add visual checkpoint at Page_t_two-objects-have-same-xpath'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00195_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
