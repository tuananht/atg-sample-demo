import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-retrieve-xpath-value-from-object-repository-object-why-part-two'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-retrieve-xpath-value-from-object-repository-object-why-part-two/84759')

'step 2: Add visual checkpoint at Page_t_unable-to-retrieve-xpath-value-from-object-repository-object-why-part-two'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00025_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
