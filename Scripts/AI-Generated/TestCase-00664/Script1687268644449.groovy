import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_specific-element-check-in-table'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/specific-element-check-in-table/50052')

'step 2: Add visual checkpoint at Page_t_specific-element-check-in-table'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00664_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
