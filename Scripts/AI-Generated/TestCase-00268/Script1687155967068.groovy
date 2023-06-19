import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_refer-data-from-excel-14'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/refer-data-from-excel-sheet/60096/14')

'step 2: Add visual checkpoint at Page_t_refer-data-from-excel-14'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00268_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
