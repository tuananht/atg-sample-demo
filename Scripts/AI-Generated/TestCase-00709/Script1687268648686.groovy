import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-select-option-by-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-select-option-by-value/16756/2')

'step 2: Add visual checkpoint at Page_t_webui-select-option-by-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00709_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
