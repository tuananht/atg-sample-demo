import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-recognize-variable-text-from-xpath-span'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-recognize-variable-text-from-xpath-span/56754')

'step 2: Add visual checkpoint at Page_t_unable-to-recognize-variable-text-from-xpath-span'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00064_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
