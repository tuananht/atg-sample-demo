import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_groovy-date-picker-adds-incorrect-date-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/groovy-date-picker-adds-incorrect-date-value/89493/3')

'step 2: Add visual checkpoint at Page_t_groovy-date-picker-adds-incorrect-date-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01129_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
